<html>
    <head>
        <%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    </head>

    <body>
        <div class="container">

            <div class="col-lg-8 col-md-10 col-sm-12 well">

                <form:form modelAttribute="demo" action="/demo" method="post" class="form-horizontal" name="demoForm">

                    <fieldset>

                        <legend>Form Input Demo</legend>

                        <form:hidden path="demoId" />

                        <div class="form-group">
                            <label  class="col-sm-2 control-label">User Name:</label>
                            <div class="col-sm-10">
                                <form:input path="userName" class="form-control"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label  class="col-sm-2 control-label">Password:</label>
                            <div class="col-sm-10">
                                <form:input path="password" class="form-control"/>
                            </div>
                        </div>



                        <div class="form-group">
                            <label class="col-sm-2 control-label">Check Boxes:</label>
                            <div class="col-sm-10">
                                <label class="checkbox-inline">
                                    <form:checkbox path="boxOne" value="checked"/>Check Box 1
                                </label>
                                <label class="checkbox-inline">
                                    <form:checkbox path="boxTwo" value="checked"/>Check Box 2
                                </label>
                                <label class="checkbox-inline">
                                    <form:checkbox path="boxThree" value="checked"/>Check Box 3
                                </label>
                            </div>
                        </div>



                        <div class="form-group">
                            <label  class="col-sm-2 control-label">TextArea:</label>
                            <div class="col-sm-10">
                                <form:textarea path="textArea" class="form-control" rows="3"/>
                            </div>
                        </div>



                        <div class="form-group">
                            <label class="col-sm-2 control-label">Radios:</label>


                                <div class="radio">
                                    <label class=radio-inline">
                                        <form:radiobutton path="radioValue"  name="optionsRadios" id="optionsRadios1" value="option1"/>
                                        Option one
                                    </label>
                                    <label class=radio-inline">
                                        <form:radiobutton path="radioValue"  name="optionsRadios" id="optionsRadios2" value="option2"/>
                                        Option two
                                    </label>
                                    <label class=radio-inline">
                                        <form:radiobutton path="radioValue"  name="optionsRadios" id="optionsRadios3" value="option3"/>
                                        Option three
                                    </label>
                                </div>

                        </div>



                        <div class="form-group">

                            <label class="col-sm-2 control-label">Select:</label>
                            <div class="col-sm-10">
                                <form:select path="selectOption" class="form-control">
                                    <form:option value="one">Option 1</form:option>
                                    <form:option value="two">Option 2</form:option>
                                    <form:option value="three">Option 3</form:option>
                                    <form:option value="four">Option 4</form:option>
                                </form:select>
                            </div>

                        </div>

                        <div class="form-group">

                            <label class="col-sm-2 control-label">Multi-Select:</label>
                            <div class="col-sm-10">
                                <form:select multiple="true" path="selectMultiple" class="form-control">
                                    <form:option value="one">Option 1</form:option>
                                    <form:option value="two">Option 2</form:option>
                                    <form:option value="three">Option 3</form:option>
                                    <form:option value="four">Option 4</form:option>
                                </form:select>
                            </div>

                        </div>



                        <form:button class="btn btn-primary btn-block">Save</form:button>





                    </fieldset>

                </form:form>

                <button name="clear" value="clear" class="btn btn-danger btn-block" onclick="document.forms[0].reset();">Cancel</button>

            </div>
        </div>

    </body>

</html>
