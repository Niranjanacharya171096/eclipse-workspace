<%@ taglib uri="WEB-INF/tlds/JdbcTag.tld" prefix="test" %> 
<html> 
  <body> 
    <%@ taglib prefix="jdbctld" uri="/WEB-INF/tlds/JdbcTag.tld" %> 
    <center> 
      <jdbctld:show username="root" password="root" db="product_db" table="product_tb"/> 
    </center> 
  </body> 
</html> 
