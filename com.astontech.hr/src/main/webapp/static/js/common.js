
/* Toggle between adding and removing the "responsive" class to topnav when the user clicks on the icon */
function toggleResposive() {
    var x = document.getElementById('myTopnav');
    if (x.className === 'topnav') {
        x.className += 'responsive';
    } else {
        x.className = 'topnav';
    }
}


//get selected Make
function selectedMake(s) {

    console.log(s[s.selectedIndex].value); // get value
    console.log(s[s.selectedIndex].id); // get id


    var makeInput = document.getElementById('inputNewVehicleMake');
    var makeId = document.getElementById('selectedMakeId');
    makeInput.value = s[s.selectedIndex].value;
    makeId.value = s[s.selectedIndex].id;

    //reset selected option
    document.getElementById('model_0').selected = 'selected';

    displayOnOff(s[s.selectedIndex].id)
}

//get selected model
function selectedModel(m) {

    console.log(m[m.selectedIndex].value); //get value

    var modelInput = document.getElementById('inputNewVehicleModel');
    modelInput.value = m[m.selectedIndex].value;
}


//show models pased on make id
function displayOnOff(id) {
    var elementList = document.getElementsByClassName('modelClass');
    var element = document.getElementById('model_' + id);

    //first clear and hide any dropdowns displaying
    for(i=1;i<=elementList.length;i++){
        var n = i;
        document.getElementById('model_' + n.toString()).style.display = 'none';
    }

    //display selected
    element.style.display = 'block';

}



