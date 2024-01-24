let fruitsname = new Array("Apple", "Banana", "Kiki", "Mango", "Strawberry");

let Listall = () => {
    let temp = "";

    fruitsname.map(
        (get) => {
            temp += "<tr><td>" + get + "</td></tr>";
        }
    )
    document.getElementById('list').innerHTML = "<table align='center'><thead><tr><th>MY SHOP FRUITS NAME </th></tr></thead><tbody>" + temp + "</tbody></table>"
}


function Create() {
    let newvalue = document.getElementById('my_value').value;

    fruitsname.unshift(newvalue);
    alert(newvalue + " has been added in my shop");
    Listall();
}

let Update = () => {
    let indexvalue = document.getElementById('my_value').value;

    let newvalue = prompt("Please enter your newvalue replace at" + indexvalue + " value in" + fruitsname[indexvalue]);

    fruitsname[indexvalue] = newvalue;
    alert(" update successfully");
    Listall();
}

let Delete = () => {
    let removevalue = document.getElementById('my_value').value;

    fruitsname = fruitsname.filter(
        (get) => {
            if (get !== removevalue) {
                return get;
            }
        }
    )
    Listall();
}


const Search = () => {
    let searchvalue = document.getElementById('my_value').value;
    for (i = 0; i < fruitsname.length; i++) {
        if (searchvalue === fruitsname[i]) {
            alert(searchvalue + " has founded at" + i);
            break;
        }
    }
}