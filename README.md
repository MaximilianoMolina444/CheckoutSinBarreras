# CheckoutSinBarreras

Proyecto de portfolio de **QA Automation Web** creado con Katalon Studio sobre la aplicación de práctica [SauceDemo](https://www.saucedemo.com/).

## Objetivo

Automatizar flujos de autenticación y compra, y sumar una comprobación introductoria de navegación por teclado. El proyecto busca mostrar organización, reutilización y verificación de resultados con Katalon Studio.

## Cobertura automatizada

| Suite | Caso / cobertura | Qué verifica |
|---|---|---|
| `TS_Login_DDT` | `TC01_LoginExitoso` | Ejecuta el inicio de sesión con cada fila del archivo de datos `LoginUsuariosValidos`. |
| `TS_Login_Negativo` | `TC02_LoginBloqueado` | Comprueba que `locked_out_user` no ingrese y que se muestre el mensaje esperado. |
| `TS_Accesibilidad` | `TC03_AccesibilidadTeclado` | Comprueba el foco de teclado en usuario, contraseña y botón Login. |
| `TS_Checkout` | `TC04_CheckoutCompleto` | Inicia sesión, agrega Sauce Labs Backpack, completa datos, valida producto y total, y confirma la compra. |
| `TSC_Login_Completa` | Colección secuencial | Ejecuta las cuatro suites juntas. La última ejecución registrada tuvo 5 iteraciones/casos aprobados. |

## Capacidades de Katalon utilizadas

- **Object Repository** para mantener los elementos web reutilizables.
- **WebUI** para interacción y verificación del navegador.
- **Test Cases, Test Suites y Test Suite Collection** para organizar la cobertura.
- **Data-driven testing** mediante el archivo `Data Files/LoginUsuariosValidos` y el binding de la suite.
- **Variables** de perfil y de caso para URL, credenciales de prueba y datos de checkout.
- **Custom Keyword** `web.SauceDemoActions.login` para reutilizar el inicio de sesión.
- **Verificaciones** de mensajes, producto, total y confirmación final.
- **Manejo básico de fallos** con `FailureHandling.CONTINUE_ON_FAILURE` en las verificaciones de teclado.
- **Reportes** de ejecución de Katalon.

## Requisitos y ejecución

- Katalon Studio 11.5.0 (versión usada al crear y ejecutar este proyecto).
- Un navegador compatible instalado. La ejecución más reciente se hizo con Edge Chromium.
- Acceso a Internet para abrir SauceDemo.

Para ejecutar la colección:

1. Abrí `CheckoutSinBarreras.prj` en Katalon Studio.
2. Confirmá que el perfil `default` tenga `baseUrl` con `https://www.saucedemo.com`.
3. En **Test Suites**, abrí `TSC_Login_Completa`.
4. Mantené el modo **Sequential** y ejecutá con **Execute**.
5. Consultá el resultado en **Reports**.

Los usuarios y la contraseña usados son credenciales públicas de la aplicación demo y están destinados únicamente a ese entorno. No uses credenciales reales.

## Accesibilidad: alcance

`TC03_AccesibilidadTeclado` es un **smoke test introductorio** del orden de foco en la pantalla de login. No es una auditoría completa ni certifica conformidad con WCAG. Como siguiente mejora se podría integrar una herramienta como axe y agregar revisiones manuales de teclado, nombres accesibles, contraste y mensajes de error.

## Estructura principal

```text
CheckoutSinBarreras/
├── Data Files/
├── Keywords/web/SauceDemoActions.groovy
├── Object Repository/
├── Profiles/
├── Test Cases/
├── Test Suites/
├── README.md
└── CheckoutSinBarreras.prj
```

Los reportes de ejecución y archivos locales de Katalon están excluidos del control de versiones mediante `.gitignore`. El reporte PDF exportado se conserva como evidencia local; revisá y anonimizá los datos del equipo antes de compartirlo públicamente.

## Estado de referencia

Última ejecución de `TSC_Login_Completa`: **4 suites, 5 ejecuciones aprobadas, 0 fallidas y 0 errores** (28 de octubre de 2026).

---

Proyecto de práctica con fines educativos y de portfolio. SauceDemo es un sitio externo de demostración; no es propiedad de este proyecto.
