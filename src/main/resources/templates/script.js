let userSearch = window.location.href
console.log(userSearch)

let userInput = document.getElementById('inputUser')
let searchButton = document.getElementById('searchButton')

searchButton.addEventListener("click", getUserData)

async function getUserData() {
    console.log(userInput.value)
    console.log("click")
    const response = await fetch(`http://localhost:8080/user/${userInput.value}`);
    const userData = await response.json();
}