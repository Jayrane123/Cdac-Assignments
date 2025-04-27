const validform =()=>{
    let form = document.forms["myForm"];
    let fname = form["fname"].value.trim();
    let lname = form["lname"].value.trim();
    let email = form["email"].value.trim();
    if (fname === "") {
        alert("First Name must be filled out");
        return false;
    }
    if (lname === "") {
        alert("Last Name must be filled out");
        return false;
    }
    if (email === "") {
        alert("Email must be filled out");
        return false;
    }
    let outputDiv = document.getElementById("output");
    outputDiv.innerHTML = `
        <h3>Submitted Data:</h3>
        <p><strong>First Name:</strong> ${fname}</p>
        <p><strong>Last Name:</strong> ${lname}</p>
        <p><strong>Email:</strong> ${email}</p>
    `;
    outputDiv.style.display = "block";

    return false;

}
