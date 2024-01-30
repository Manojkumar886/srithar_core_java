let ValidateForm = () => {
    var name = document.getElementById('name').value;
    var age = document.getElementById('age').value;
    var address = document.getElementById('address').value;
    var email = document.getElementById('email').value;

    if (name == "") {
        alert(" name is Required");
        return false;
    }
    // if (age == "") {
    //     alert(" age is Required");
    //     return false;
    // }
    // if (address == "") {
    //     alert(" address is Required");
    //     return false;
    // }
    // if (email == "") {
    //     alert(" email is Required");
    //     return false;
    // }


    return true;
}

const showData = () => {
    var liststudent = "";

    if (localStorage.getItem("zealous") == null) {
        liststudent = [];
    }
    else {
        liststudent = JSON.parse(localStorage.getItem("zealous"));
    }

    var html = "";
    liststudent.forEach((element, index) => {
        html += "<tr>";
        html += "<td>" + element.name + "</td>";
        html += "<td>" + element.age + "</td>";
        html += "<td>" + element.address + "</td>";
        html += "<td>" + element.email + "</td>";
        html += '<td><button onclick="updateData(' + index + ')">EDIT</button> <button onclick="deleteData(' + index + ')">REMOVE</button></td>'
        html += "</tr>";
    })
    document.querySelector('#crudTable tbody').innerHTML = html;
}


document.onload = showData();

function addData() {
    if (ValidateForm() == true) {

        // var name = document.getElementById('name').value;

        // var sample = [];

        // sample.push(name);

        // localStorage.setItem(" momo", sample);

        var name = document.getElementById('name').value;
        var age = document.getElementById('age').value;
        var address = document.getElementById('address').value;
        var email = document.getElementById('email').value;


        var createstudent = "";

        if (localStorage.getItem("zealous") == null) {
            createstudent = [];
        }
        else {
            createstudent = JSON.parse(localStorage.getItem("zealous"));
        }
        createstudent.push(
            {
                name: name,
                age: age,
                address: address,
                email: email
            })

        // localstorage.setItem(key ,mystudentValue);
        localStorage.setItem("zealous", JSON.stringify(createstudent))

        showData();

        document.getElementById('name').value = ""
        document.getElementById('age').value = ""
        document.getElementById('address').value = ""
        document.getElementById('email').value = ""
    }
}



function deleteData(index) {
    var deletestudent = "";

    if (localStorage.getItem("zealous") == null) {
        deletestudent = [];
    }
    else {
        deletestudent = JSON.parse(localStorage.getItem("zealous"));
    }
    deletestudent.splice(index, 1);
    localStorage.setItem("zealous", JSON.stringify(deletestudent))

    showData();
}