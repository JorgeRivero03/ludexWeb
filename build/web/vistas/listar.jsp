<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.DConsumo"%>
<%@page import="ModeloDAO.DConsumoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <h1>Consumo</h1>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID Consumo</th>
                        <th>Fecha de Consumo</th>
                        <th>Cantidad</th>
                        <th>Gasto</th>
                        <th>ID MAdiccion</th>
                    </tr>
                </thead>
                <%
                    DConsumoDAO dao = new DConsumoDAO();
                    List<DConsumo>list = dao.listarCon();
                    Iterator<DConsumo>iter = list.iterator();
                    DConsumo dc = null;
                    while(iter.hasNext()){
                        dc = iter.next();
                    }
                %>
                <tbody>
                    <tr>
                        <td><%=dc.getId_consumo()%></td>
                        <td><%=dc.getFecha_con()%></td>
                        <td><%=dc.getCant_con()%></td>
                        <td><%=dc.getGasto_con()%></td>

                    </tr>
                    <%
                        
                    %>
                    
                </tbody>
            </table>
        </div>
    </body>
</html>
