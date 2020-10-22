<div class="navbar navbar-default">
        <div class="container-fluid">
            <ul class="nav navbar-nav">
                <li><a href="index.php">Home</a></li>
                <li><a href="Saisie.php">AjouterClient</a></li>
              
                <li><% if (session != null) {
         			if (session.getAttribute("user") != null) {
            		String name = (String) session.getAttribute("user");
            		out.print(name);
         			} else {
            		response.sendRedirect("index.jsp");
         			}
      				}
   					%>
   				</li>
   				<li>
   				<form action="Login" method="get">
      			<input type="submit" value="Logout">
   				</form>
   				</li>
            </ul>
        </div>
    </div>