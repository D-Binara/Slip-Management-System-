function submitForm() {
    var name = document.getElementById("name").value;
    var amount = document.getElementById("amount").value;

    // Send data to the backend
    fetch('/api/v1/user/saveUser', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({name: name,  fullAmount:amount})
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
