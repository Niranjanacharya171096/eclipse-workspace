<%@taglib uri="http://www.springframework.org/tags/form" 
prefix="html"%>

<html:form commandName="form">
<h1>Employee Registration and Validation-extendingSimpleFormController</h1>
<pre>
<html:errors/>
	NAME: <html:input path="name"/>
	EMAIL: <html:input path="email"/>
	<input type="submit" name="SUBMIT"/> 
</pre>
</html:form>