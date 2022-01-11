let headerDateElement = document.getElementById('header-date');

let dateElement = document.getElementById('date');
let date = new Date();

headerDateElement.innerHTML = 'Date : ' + date.toLocaleDateString("en-US") + ' : ' + date.toLocaleString('en-US', {
    hour: 'numeric',
    hour12: true
});
dateElement.innerHTML = date.getFullYear();




// login 

let loginElement = document.getElementById('login');


loginElement.onsubmit = function(event) {
    event.preventDefault();
    let loginUserNameValue = document.getElementById('login-user-name').value;
    let loginPasswordValue = document.getElementById('login-password').value;

    let loginUserNameErrorElement = document.getElementById('login-user-name-error');
    let loginPasswordErrorElement = document.getElementById('login-password-error');

    if (!loginUserNameValue) {
        loginUserNameErrorElement.innerHTML = "*required";
        loginUserNameErrorElement.classList.remove('d-none');
    } else {
        loginUserNameErrorElement.classList.add('d-none');
    }

    if (!loginPasswordValue) {
        loginPasswordErrorElement.innerHTML = "*required";
        loginPasswordErrorElement.classList.remove('d-none');
    } else {
        loginPasswordErrorElement.classList.add('d-none');
    }

    if (loginUserNameValue && loginPasswordValue) {

        let details = JSON.parse(localStorage.getItem("registerDetails"));
        let isUserExist = false;
        for (let userDetails of details) {

            let userExist = userDetails.userName === loginUserNameValue;
            if (userExist) {
                isUserExist = true;
                let passwordMatched = userDetails.password === loginPasswordValue;
                if (passwordMatched) {
                    loginUserNameErrorElement.classList.add('d-none');
                    loginPasswordErrorElement.classList.add('d-none');
                    display('sectionView');
                    break;
                } else {
                    loginPasswordErrorElement.innerHTML = "Invalid Password";
                }
            } else {
                loginUserNameErrorElement.innerHTML = "UserName Not Exist";
            }
        }


        if (isUserExist) {
            loginUserNameErrorElement.classList.add('d-none');
            loginPasswordErrorElement.classList.remove('d-none');
        } else {
            loginUserNameErrorElement.innerHTML = "UserName Not Exist";
            loginUserNameErrorElement.classList.remove('d-none');
            loginPasswordErrorElement.classList.remove('d-none');
        }

    }
};


// add 

let eidElement = document.getElementById('eid');
let nameElement = document.getElementById('name');
let salaryElement = document.getElementById('salary');
let departmentElement = document.getElementById('department');
let skillElement = document.getElementById('skill');
let addBtnElement = document.getElementById('add-btn');
let clearBtnElement = document.getElementById('clear-btn');

addBtnElement.onclick = function() {
    console.log(eidElement, eidElement.value, departmentElement.value, 2);
    let eid = eidElement.value;
    let name = nameElement.value;
    let salary = salaryElement.value;
    let department = departmentElement.value;
    let skill = salaryElement.value;

    let eidErrorElement = document.getElementById('eid-error');
    let nameErrorElement = document.getElementById('name-error');
    let salaryErrorElement = document.getElementById('salary-error');

    if (eid === "")
        eidErrorElement.classList.remove("d-none");
    else
        eidErrorElement.classList.add("d-none");

    if (name === "")
        nameErrorElement.classList.remove("d-none");
    else
        nameErrorElement.classList.add("d-none");

    if (salary === "")
        salaryErrorElement.classList.remove("d-none");
    else
        salaryErrorElement.classList.add("d-none");

    if (eid !== "" && name !== "" && salary !== "") {
        let details = {
            eid: eid,
            name: name,
            salary: salary,
            department: department,
            skill: skill
        };
        let previousDetails = JSON.parse(localStorage.getItem("details"));

        if (previousDetails) {
            details = [...previousDetails, details];
        } else {
            details = [details];
        }

        let stringifiedDetails = JSON.stringify(details);
        localStorage.setItem("details", stringifiedDetails);
        console.log(localStorage.getItem('details'), previousDetails, details);
    }

};

clearBtnElement.onclick = function() {
    eidElement.value = '';
    nameElement.value = '';
    salaryElement.value = '';
    departmentElement.value = 'IT';
    skillElement.value = 'HTML';
};



// new 

let formElement = document.getElementById('form');

let firstNameErrorElement = document.getElementById('first-name-error');
let lastNameErrorElement = document.getElementById('last-name-error');
let userNameErrorElement = document.getElementById('user-name-error');
let passwordErrorElement = document.getElementById('password-error');
let addressErrorElement = document.getElementById('address-error');
let contactNoErrorElement = document.getElementById('contact-no-error');

const checkError = function(value, element) {
    let isEmpty = value === "";
    if (isEmpty)
        element.classList.remove('d-none');
    else
        element.classList.add('d-none');
    return isEmpty;
};

formElement.onsubmit = function(event) {
    event.preventDefault();
    let firstNameValue = document.getElementById('first-name').value;
    let lastNameValue = document.getElementById('last-name').value;
    let userNameValue = document.getElementById('user-name').value;
    let passwordValue = document.getElementById('password').value;
    let addressValue = document.getElementById('address').value;
    let contactNoValue = document.getElementById('contact-no').value;

    let err1 = checkError(firstNameValue, firstNameErrorElement);
    let err2 = checkError(lastNameValue, lastNameErrorElement);
    let err3 = checkError(userNameValue, userNameErrorElement);
    let err4 = checkError(passwordValue, passwordErrorElement);
    let err5 = checkError(addressValue, addressErrorElement);
    let err6 = checkError(contactNoValue, contactNoErrorElement);

    if (!(err1 || err2 || err3 || err4 || err5 || err6)) {
        let registerObject = {
            firstName: firstNameValue,
            lastName: lastNameValue,
            userName: userNameValue,
            password: passwordValue,
            address: addressValue,
            contactNo: contactNoValue
        };
        let previousDetails = JSON.parse(localStorage.getItem("registerDetails"));
        let details;
        if (previousDetails) {
            details = [...previousDetails, registerObject];
        } else {
            details = [registerObject];
        }
        localStorage.setItem("registerDetails", JSON.stringify(details));
        display('sectionLogin');
    }

};



// view 


let values = JSON.parse(localStorage.getItem("details"));

let totalEmployessElement = document.getElementById('totalEmployees');
totalEmployessElement.innerHTML = values.length;

let total = 0;
values.forEach((detail, index) => {
    total = total + detail.salary;
    let tblRow = `
        <tr>
            <td>${index}</td>
            <td>${detail.eid}</td>
            <td>${detail.name}</td>
            <td>${detail.salary}</td>
            <td>${detail.department}</td>
            <td>${detail.skill}</td>
        </tr>
    `;
    $('#tbody').append(tblRow);
});

let netSalaryElement = document.getElementById('netSalary');
netSalaryElement.innerHTML = total / values.length




// remove

let removeBtnElement = document.getElementById('remove-btn');

removeBtnElement.onclick = function() {
    let employeeIdErrorElement = document.getElementById('remove-employee-id-error');
    let employeeId = document.getElementById('remove-employee-id').value;
    if (employeeId) {
        let allDetails = JSON.parse(localStorage.getItem('details'));
        let employeeDetails = allDetails.find(details => details.eid === employeeId);
        if (employeeDetails) {
            let updatedDetails = allDetails.filter(details => details.eid !== employeeId);
            localStorage.setItem("details", JSON.stringify(updatedDetails));
            alert("Employee deleted");
        } else {
            alert("Employee Id Not Found");
        }
        employeeIdErrorElement.classList.add('d-none');
    } else {
        employeeIdErrorElement.classList.remove('d-none');
    }
};




// search 

let searchEmployeeBtnElement = document.getElementById('search-employee-btn');

searchEmployeeBtnElement.onclick = function() {
    let employeeIdErrorElement = document.getElementById('search-employee-id-error');

    let employeeTableElement = document.getElementById('search-employee-table');
    let searchNotFoundElement = document.getElementById('search-not-found');
    let employeeId = document.getElementById('search-employee-id').value;

    if (employeeId) {
        let allDetails = JSON.parse(localStorage.getItem('details'));
        let employeeDetails = allDetails.find(details => details.eid === employeeId);


        if (employeeDetails) {
            let tblRow = `
                    <tr>
                        <td>${employeeDetails.eid}</td>
                        <td>${employeeDetails.name}</td>
                        <td>${employeeDetails.salary}</td>
                        <td>${employeeDetails.department}</td>
                        <td>${employeeDetails.skill}</td>
                    </tr>
                `;

            $("#search-employee-table #search-employee-table-body tr").remove();
            $('#search-employee-table-body').append(tblRow);

            employeeTableElement.classList.remove('d-none');
            searchNotFoundElement.classList.add('d-none');
        } else {
            employeeTableElement.classList.add('d-none');
            searchNotFoundElement.classList.remove('d-none');
        }
        employeeIdErrorElement.classList.add('d-none');
    } else {
        employeeIdErrorElement.classList.remove('d-none');
        employeeTableElement.classList.add('d-none');
        searchNotFoundElement.classList.add('d-none');
    }


    console.log(employeeDetails, employeeDetails);
};