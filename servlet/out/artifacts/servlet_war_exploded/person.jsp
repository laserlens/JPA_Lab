<%--
  Created by IntelliJ IDEA.
  User: Adrian.Flak
  Date: 6/13/2017
  Time: 2:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
    <link rel="stylesheet" href="./static/css/site.css" />
    <title>Person Mangament</title>
</head>
<body>

  <div class="border">

    <form name="choosePerson" action="./person" method="post">
      Form #1 Choose a Person:&nbsp;

      <input type="hidden" name="formName" value="choosePerson">

      <select name="selectPerson">

        <c:forEach var="person" items="${personList}">

          <c:choose>

            <c:when test="${person.personid == personId}">
               <option selected value="${person.personid}">${person.firstName} ${person.lastName}</option>
             </c:when>
             <c:otherwise>
                <option value="${person.personid}">${person.firstName} ${person.lastName}</option>
            </c:otherwise>

          </c:choose>

        </c:forEach>

      </select>

      ${selectPerson}

      <button type="submit">Select Person</button>

    </form>

  </div>

  <div class="border">



    <form name="updatePerson" action="./person" method="post">
      Form #2 Update a Person:

      <input type="hidden" name="formName" value="updatePerson">
      <input type="hidden" name="personId" value="${personId}">

      <div>
        <input type="text" name="title" value="${title}" placeholder="Title ie: Mrs Dr Major">
      </div>
      <div>
        <input type="text" name="firstName" value="${firstName}" placeholder="First Name">
      </div>
      <div>
        <input type="text" name="lastName" value="${lastName}" placeholder="Last Name">
      </div>
      <div>
        <input type="date" name="birthDate" value="${birthDate}" >
      </div>

      <button type="submit">Update Person</button>
      <br>
      ${updateSuccessful}

    </form>

  </div>

</body>
</html>
