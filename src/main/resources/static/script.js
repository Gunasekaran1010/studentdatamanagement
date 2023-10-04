function login(event) {
    event.preventDefault();

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    fetch('http://localhost:8081/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({
            username: username,
            password: password
        })
    })
    .then(response => response.json())
    .then(data => {
        if (data.id) {
            document.getElementById('firstName').textContent = data.firstname;
            document.getElementById('lastName').textContent = data.lastname;
            document.getElementById('age').textContent = data.age;
            document.getElementById('department').textContent = data.department;
            document.getElementById('studentData').style.display = 'block';
        } else {
            alert('Invalid username or password. Please try again.');
        }
    });
}
