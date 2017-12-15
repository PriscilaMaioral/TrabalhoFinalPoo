<%-- 
    Document   : teste
    Created on : Dec 15, 2017, 1:24:54 AM
    Author     : LuizV1
--%>

<%@page import="com.domain.web.Filmes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <%try{%>
            <% for(Filmes f : Filmes.listarTodosFilmes()){%>
                   <tr>
                       <td><%=f.getNm_filme()%></td>
                       <td><%=f.getDs_genero()%></td>
                       <td><%=f.getQt_duracao()%></td>
                       <td><%=f.getDt_lancamento()%></td>
                       <td><%=f.getNm_diretor()%></td>
                       <td><%=f.getNr_avaliacao()%></td>
                  </tr>
                  
                  <%}%>
                  <%}catch(Exception ex){%>
                <tr>
                    <td colspan="5">
                        Erro ao carregar a lista: <%=ex.getMessage()%>
                    </td>
                </tr>
           <%}%> 
        </table>
    </body>
</html>
