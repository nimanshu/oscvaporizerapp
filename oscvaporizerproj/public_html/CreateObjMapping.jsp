<!DOCTYPE html>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
    <%@ include file="/header.jsp" %>
    <title>Create Object Mapping</title>
    <body>
        <div class="container">
        <div class="row">
        <div class="col-sm-12">
    <form action="projectservlet" method="POST" class="row col-sm-12">
        <input type="submit" name="goHome" value="Home"  class="btn btn-primary"/>
    </form>
    <br><br><br><form name="test" action="projectservlet" method="post" data-toggle="validator">
            <div class="form-group row">
                        <label class="col-sm-4">Sequence: </Label>
                        <div class="col-sm-6">
                            <input id="SEQUENCE_NUM" class="form-control" name="SEQUENCE_NUM" required/>
                        </div>
            </div>
            <div class="form-group row">
                    <Label class="col-sm-4">Siebel Object: </label>
                    <div class="col-sm-6">
                        <div class="input-group">
                            <input id="SIEBEL_OBJECT" name="SIEBEL_OBJECT" class="form-control" required>
                              <span class="input-group-btn">
                              <button type="button" class="btn glyphicon glyphicon-search input-glyph" data-toggle="modal" onclick="populateSiebObjectTable()"></button>
                            </span>
                        </div>
                    </div>
            </div>
            <div class="form-group row">
                    <Label class="col-sm-4">Siebel Primary Base Table: </label>
                    <div class="col-sm-6">
                        <input  id="SIEBEL_PRIM_BASE_TABLE" name="SIEBEL_PRIM_BASE_TABLE" class="form-control" readonly/> 
                        <!--<output id="SIEBEL_PRIM_BASE_TABLE" name="SIEBEL_PRIM_BASE_TABLE"></output>-->
                    </div>
            </div>
            <div class="form-group row">
                    <Label class="col-sm-4">OSC Object: </label>
                        <div class="col-sm-6">
                        <div class="input-group">
                            <input id="OSC_OBJECT" name="OSC_OBJECT" class="form-control" required>
                              <span class="input-group-btn">
                              <button type="button" class="btn glyphicon glyphicon-search input-glyph" data-toggle="modal" onclick="populateOscObjectTable()"></button>
                            </span>
                            </div>
                        </div>
            </div>
            <div class="form-group row">
                    <Label class="col-sm-4">Extraction Query: </label>
                    <div class="col-sm-6">
                        <input  id="EXTRACTION_QUERY" class="form-control"  name="EXTRACTION_QUERY"/>
                    </div>
            </div>
            <div class="form-group row">
                <button type="submit" name="createObjMapping" value="Submit" class="btn btn-success pull-right">SUBMIT</button>
            </div>
                       
            </form>
        </div>
        </div>
    </div>
    
    
  <div id="siebObjectTable" class="modal fade" role="dialog">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">Siebel Objects List</h4>
          </div>
          <div class="modal-body">
            <table id="siebelObjectListTable" class="display" width="100%">
            <thead>
                <tr>
                    <th>SIEBEL OBJECT NAME</th>
                    <th>BASE TABLE NAME</th>
                </tr>        
            </thead>
                    
            <!--<tbody>
            <tr><td>Account</td></tr>
            <tr><td>Contact</td></tr>
            </tbody>-->
            </table>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" onclick="submitSiebObj()">SUBMIT</button>
          </div>
        </div>
      </div>
</div>


<div id="oscObjectTable" class="modal fade" role="dialog">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4 class="modal-title">OSC Objects List</h4>
          </div>
          <div class="modal-body">
            <table id="oscObjectListTable" class="display" width="100%">
            <thead>
                <tr>
                    <th>OSC OBJECT NAME</th>
                </tr>        
            </thead>
            </table>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" onclick="submitOscObj()">SUBMIT</button>
          </div>
        </div>
      </div>
</div>
    
    
    </body>
    <%@ include file="/footer.jsp" %>
    <script type="text/javascript">
            function populateSiebObjectTable() 
            {
             var siebObjName = $('#SIEBEL_OBJECT').val();   
//                setTimeout(function(){
//                    $('#loading-overlay').addClass('hide');
//                    $('#siebObjectTable').modal('show');
//                },500);
                
                
//                $.ajax({
//                    type: "POST",
//                    url: "getsiebelobjectslist",
//                    data: {siebObjName: siebObjName} ,
//                    dataType: "json",
//                    success: function( data, textStatus, jqXHR) {
//                       
//                        $('#loading-overlay').addClass('hide');
//                    },
//                    error: function(jqXHR, textStatus, errorThrown){
//                        
//                        $('#loading-overlay').addClass('hide');
//                    },
//                    beforeSend: function(jqXHR, settings){
//                        $('#loading-overlay').removeClass('hide');
//                    },
//                    complete: function(jqXHR, textStatus){
//                        $('#loading-overlay').addClass('hide');
//                    }
//                });


$('#loading-overlay').removeClass('hide');
setTimeout(function(){
    if ( ! $.fn.DataTable.isDataTable( '#siebelObjectListTable' ) ) {
         var siebelObjectListTable = $('#siebelObjectListTable').DataTable({
                "ajax": {
                        "url": "getsiebelobjectslist",
                        "type": "POST",
                        "data": {siebObjName: siebObjName}
                    },
                "columns": [
                    { "data": "objectName" },
                    { "data": "baseTableName" }
                    ]
                });
                
                $('#siebelObjectListTable tbody').on( 'click', 'tr', function () {
                if ( $(this).hasClass('selected') ) {
                    $(this).removeClass('selected');
                }
                else {
                    siebelObjectListTable.$('tr.selected').removeClass('selected');
                    $(this).addClass('selected');
                }
                });
        }
            
        
    $('#siebObjectTable').modal("show");
    $('#loading-overlay').addClass('hide');
},500);

}

function submitSiebObj()
{
    var rowData = $('#siebelObjectListTable').DataTable().row($('.selected')).data();
    var siebObjName = rowData.objectName;
    var siebObjBaseTableName = rowData.baseTableName;
    $('#SIEBEL_OBJECT').val(siebObjName);
    $('#SIEBEL_PRIM_BASE_TABLE').val(siebObjBaseTableName);
    $('#siebObjectTable').modal("hide");
}


function populateOscObjectTable(){
    $('#loading-overlay').removeClass('hide');
    setTimeout(function(){
        if ( ! $.fn.DataTable.isDataTable( '#oscObjectListTable' ) ) {
             var oscObjectListTable = $('#oscObjectListTable').DataTable({
                    "ajax": {
                            "url": "getoscobjectslist"
                        },
                    "columns": [
                        { "data": "oscObjectName" }
                        ]
                    });
                    
                    $('#oscObjectListTable tbody').on( 'click', 'tr', function () {
                    if ( $(this).hasClass('selected') ) {
                        $(this).removeClass('selected');
                    }
                    else {
                        oscObjectListTable.$('tr.selected').removeClass('selected');
                        $(this).addClass('selected');
                    }
                    });
            }
        $('#oscObjectTable').modal("show");
        $('#loading-overlay').addClass('hide');
    },500);
}

function submitOscObj()
{
    var rowData = $('#oscObjectListTable').DataTable().row($('.selected')).data();
    var oscObjName = rowData.oscObjectName;
    $('#OSC_OBJECT').val(oscObjName);
    $('#oscObjectTable').modal("hide");
}

            
           
        </script>
</html>