/*
function fetchUsuarios() {
    fetch('/consultas/usuarios')
        .then(response => response.json())
        .then(data => {
            mostrarResultados(data);
        });
}

function fetchSoporte() {
    fetch('/consultas/soportes')
        .then(response => response.json())
        .then(data => {
            mostrarResultados(data);
        });
}

function fetchMantenimientos() {
    fetch('/consultas/mantenimientos')
        .then(response => response.json())
        .then(data => {
            mostrarResultados(data);
        });
}

function mostrarResultados(data) {
    const resultadosDiv = document.getElementById('resultados');
    resultadosDiv.innerHTML = JSON.stringify(data, null, 2);
}*/
//Script con tablas
function fetchUsuarios() {
    fetch('/consultas/usuarios')
        .then(response => response.json())
        .then(data => {
            mostrarResultados(data, "Usuarios");
            history.pushState(null, '', '/consultas/usuarios');
        });
}

function fetchSoporte() {
    fetch('/consultas/soportes')
        .then(response => response.json())
        .then(data => {
            mostrarResultados(data, "Soporte");
            history.pushState(null, '', '/consultas/soportes');
        });
}

function fetchMantenimientos() {
    fetch('/consultas/mantenimientos')
        .then(response => response.json())
        .then(data => {
            mostrarResultados(data, "Mantenimientos");
            history.pushState(null, '', '/consultas/mantenimientos');
        });
}

function mostrarResultados(data, tipo) {
    const resultadosDiv = document.getElementById('resultados');
    resultadosDiv.innerHTML = ""; // Limpiar resultados anteriores

    // Crear título dinámico
    const title = document.createElement('h2');
    title.textContent = `Resultados de ${tipo}`;
    resultadosDiv.appendChild(title);

    // Crear tabla
    const table = document.createElement('table');
    table.classList.add('table'); // Usamos una clase CSS para la tabla

    // Crear encabezados de la tabla basados en los datos
    const headers = Object.keys(data[0]);
    const thead = document.createElement('thead');
    const headerRow = document.createElement('tr');
    headers.forEach(header => {
        const th = document.createElement('th');
        th.textContent = header.replace(/_/g, " ").toUpperCase(); // Formateamos el nombre de las columnas
        headerRow.appendChild(th);
    });
    thead.appendChild(headerRow);
    table.appendChild(thead);

    // Crear el cuerpo de la tabla con los datos
    const tbody = document.createElement('tbody');
    data.forEach(item => {
        const row = document.createElement('tr');
        headers.forEach(header => {
            const td = document.createElement('td');
            td.textContent = item[header];
            row.appendChild(td);
        });
        tbody.appendChild(row);
    });

    table.appendChild(tbody);
    resultadosDiv.appendChild(table);
}

