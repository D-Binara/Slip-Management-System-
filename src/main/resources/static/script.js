function submitFormLogin() {
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    // Send data to the backend
    fetch('/api/v1/user/getUsers', {
        method: 'Get',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({email: email, password:password})
    })
        .then(response => response.json())
        .then(data => {
            // Handle the response from the backend
            console.log(data);
        })
        .catch(error => {
            console.error('Error:', error);
        });

}


//Register Page
function submitFormRegister() {
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    // Send data to the backend
    fetch('/api/v1/user/saveUser', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({name: name, email: email, password:password})
    })
        .then(response => response.json())
        .then(data => {
            // Handle the response from the backend
            console.log(data);
        })
        .catch(error => {
            console.error('Error:', error);
        });

}