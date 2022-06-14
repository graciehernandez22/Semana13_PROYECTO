
<%@page import="Model.Categoria"%>
<%@page contentType = "text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<jsp:useBean id="lista" scope="session" class="java.util.List" />
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file = "WEB-INFO/Vistas_Parciales/css-js.jspf"%>
    </head>
    <body>
         <%@include file = "WEB-INFO/Vistas_Parciales/encabezado.jspf"%>
         <div style="width: 600px;">
             <a href="%" class="btn btn-success btn-sm glyphicon-pencil" role="button">
                 Nueva categoria
             </a>     
             <h3> Listado de Categorias </h3>
             <table class="table table-striped"
                     <tr>
                     <th>
                         ID
                     </th>
                       <th>
                         NOMBRE
                     </th>
                       <th>
                         ACCIONES
                     </th>
                 </tr>
                 <% for(int i = 0 ; i < lista.size(); i++){
                       Categoria categoria = new Categoria();
                       categoria = (Categoria)lista.get(i);//(categoria) es para el casting
                 %>
                 <tr>
                     <td><%= categoria.getId_categoria() %></td>
                     <td><%= categoria.getId_categoria() %></td>
                     <td><%= categoria.getId_categoria() %></td>
                     <td>
                         <a href="#" class="btn btn-info btn-sm glyphicon-pencil-edit" role="button">Editar</a> 
                         <a href="#" class="btn btn-danger btn-sm glyphicon-pencil-remove" role="button">Eliminar</a> 
                     </td>
                 </tr>
      <%                 
       }              
      %>              
                    
             </table>              
                    
                    
        //<div>Bienvenid</div>
         <%@include file = "WEB-INFO/Vistas_Parciales/pie.jspf"%>
        
    </body>
</html>
