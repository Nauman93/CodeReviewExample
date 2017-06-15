//Find the max id

function maxEmplID (employees, selection)

{

var maxID=employees[0];

for (i=0; i < employees.length; i++){

if (employees[i] > maxID)

{

console.log("Test maxID: " + maxID + ", current value: " + employees[i]);

maxID = employees[i];

}

}

var minID=employees[0];

for (i=0; i < employees.length; i++){

if (employees[i] < minID)

{

console.log("Test minID: " + minID + ", current value: " + employees[i]);

minID = employees[i];

}

}

//create an object

var res = {maxID, minID};

return res;