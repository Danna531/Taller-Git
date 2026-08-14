# EcoCoffee - Sistema de Gestión e Inventario

Sistema de gestión de pedidos e inventario para una cafetería, desarrollado en Java como parte del taller de Control de Versiones con Git y GitHub de la asignatura Fundamentos de Ingeniería de Software (Pontificia Universidad Javeriana).

---

## Descripción

El proyecto implementa un modelo básico de gestión de pedidos, permitiendo registrar productos, clientes y calcular totales con descuentos e impuestos aplicados sobre los pedidos.

---

## Integrantes del Equipo

> **Instrucción:** Cada integrante debe editar esta tabla en su rama de trabajo para incluir sus datos mediante un Pull Request.

| Integrante   | Rol Scrum | Perfil de GitHub                |
| ------------ | --------- | -------------------------------- |
| Danna Chacón | Developer | <https://github.com/danna531>   |

---

## Tecnologías

- Java (JDK)
- Git y GitHub para control de versiones
- Metodología ágil Scrum (ramas `develop`/`feature`, Pull Requests, issues)

---

## Estructura del Proyecto
```
 Taller_Github_FIS2630/
├── Main.java # Clase principal, punto de entrada del programa
├── Pedido.java # Gestión de pedidos: total, descuentos e impuestos
├── Producto.java # Modelo de producto con validación de precio
├── Cliente.java # Modelo de cliente
├── .gitignore
└── README.md 
```
---

## Compilación y Ejecución Local

Para verificar que el sistema compila y funciona correctamente en tu máquina local:

```
javac *.java

java Main
```
---

## Flujo de Trabajo (GitFlow)

- **`main`**: rama estable de producción.
- **`develop`**: rama de integración con el trabajo en desarrollo.
- **`features-<nombre>`**: cada integrante trabaja su tarea en una rama propia, creada desde `develop`.

Cada commit sigue la convención de *conventional commits* (`feat:`, `fix:`, `docs:`) y se vincula a su issue correspondiente (`#n`).