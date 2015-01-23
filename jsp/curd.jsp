<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<title>Dispatch Action</title>
</head>
<body>
<s:form>
<table>
        <tr><td><s:textfield name="number1" label="Number 1 " id="number1"/></td></tr>
        <tr><td><s:textfield name="number2" label="Number 2 " id="number2"/></td></tr>
        <tr><td><s:textfield name="result" label="Result " readonly="true" /></td></tr>
        <tr>
        <td><s:textfield name="methodName" label="Method involked " readonly="true" /></td>
        </tr>
        <tr>
            <td><s:submit action="addNumber" value="Add" align="left"/></td>
            <td><s:submit action="subtractNumber" value="Subtract" align="left"/></td>
            <td><s:submit action="divideNumber" value="Divide" align="left"/></td>
            <td><s:submit action="multiplytNumber" value="Multiply" align="left"/></td>
            <td><s:submit align="left"/></td>   
        </tr>
</table>
</s:form>
</body>
</html>