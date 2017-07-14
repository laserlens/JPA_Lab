<%--
  Created by IntelliJ IDEA.
  User: Adrian.Flak
  Date: 6/15/2017
  Time: 10:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<html>
<head>
  <link rel="stylesheet" href="./static/css/site.css" />
  <title>Vehicle Mangament</title>

</head>
<body>

<div class="border">

  <form name="addVehicle" action="./vehicle" method="post">
     Choose a Make :&nbsp;
    <div class="container">
     <input type="hidden" name="formVehicle" value="addVehicle">

        <c:set var="makeid" scope="application" value="${makeId}"/>

        <select name="selectMake" onChange="submit()">

            <option selected disabled="disabled">First Choose a Make</option>

         <c:forEach var="make" items="${makeListAdd}">

             <c:if test="${makeid == make.vehicleMakeid }">
                 <option selected value="${make.vehicleMakeid}">${make.vehicleMakeName}</option>
             </c:if>

             <c:if test="${makeid != make.vehicleMakeid }">
                 <option value="${make.vehicleMakeid}">${make.vehicleMakeName}</option>
             </c:if>

         </c:forEach>

         </select>
    </div>
      <br>
      Choose a Model:&nbsp;
      <div class="container">
          <select name="selectModel">
              <option selected disabled="disabled" >Choose Model after Make</option>
          <c:forEach var="model" items="${sortedModelList}">
              <option value="${model.vehicleModelid}">${model.vehicleModelName}</option>
          </c:forEach>

         </select>
      </div>
      <div>
          <br>
          Plate:
       <div class="container">
           <input type="text" name="licensePlate" value="${licensePlate}" placeholder="License Plate">
       </div>
          <br>
          VIN:
         <div class="container">
              <input type="text" name="vin" value="${vin}" placeholder="VIN">
          </div>
            <br>
         Year:
          <div class="container">
            <input type="number" name="year" value="${year}" placeholder="Year">
          </div>
           <br>
          Color:
         <div class="container">
              <input type="text" name="color" value="${color}" placeholder="Color">
         </div>
         </div>
      <br>

      <button type="submit" name="addButton" value="1">Add Vehicle</button>

      ${addSuccessful}

  </form>

</div>

<div class="border">    ${successful}  </div>

<div class="border">

   <div>
       <div class="topContainer">
           <div class="title">License Plate</div>
           <div class="title">VIN</div>
           <div class="title">Year</div>
           <div class="title">Color</div>
           <div class="titleModel">Make</div>
           <div class="titleModel">Model</div>
       </div>
    <div class="bottomContainer">

            <c:forEach var="vehicle" items="${vehicleList}" varStatus="status">
                <form name="${status.index}" action="./vehicle" method="post">
                    <input type="hidden" name="formVehicle" value="${vehicle.vehicleModelid}">

                <div>

                    <input type="hidden" name="vehicleId" value="${vehicle.vehicleid}">
                    <input type="text" name="licensePlate" value="${vehicle.licensePlate}">
                    <input type="text" name="vin" value="${vehicle.vin}" >
                    <input type="number" name="year" value="${vehicle.year}" >
                    <input type="text" name="color" value="${vehicle.color}" >

                    <c:set var="vehicleModelid" scope="application" value="${vehicle.vehicleModelid}"/>

                    <c:forEach var="model" items="${modelList}" varStatus="modelIndex" >
                        <c:if test="${vehicleModelid == model.vehicleModelid}">
                            <c:set var="vehicleMakeid" scope="application" value="${model.vehicleMakeid}"/>
                        </c:if>
                    </c:forEach>

                    <select name="selectMake" >
                    <c:forEach var="make" items="${makeList}">
                        <c:choose>
                            <c:when test="${vehicleMakeid == make.vehicleMakeid}">
                                <option selected value="${make.vehicleMakeid}" >${make.vehicleMakeName}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${make.vehicleMakeid}">${make.vehicleMakeName}</option>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                    </select>

                    <select name="selectModel" >
                        <c:forEach var="model" items="${modelList}" varStatus="modelIndex" >

                            <c:choose>
                                <c:when test="${vehicleModelid == model.vehicleModelid}">
                                    <%--<c:set var="vehicleMakeid" scope="application" value="${model.vehicleMakeid}"/>--%>
                                    <option selected value="${model.vehicleModelid}">${model.vehicleModelName}</option>
                                </c:when>
                                <c:otherwise>
                                    <c:if test="${model.vehicleMakeid == vehicleMakeid}">
                                        <option value="${model.vehicleModelid}">${model.vehicleModelName}</option>
                                    </c:if>
                                </c:otherwise>
                            </c:choose>

                        </c:forEach>
                    </select>


                    <button type="submit" name="button" value="1">Update</button>

                    <button type="submit" name="button" value="0">Delete</button>

                </div>
                </form>

            </c:forEach>


    </div>
   </div>

</div>

</body>
</html>