# UI Test
Это проект по автоматизации тестирования сайта https://stepik.org/catalog с использованием Selenium Webdriver и Java.
При проектировании использовался паттерн Page Object.
Сброка проета осуществляется Maven+Testng. Для генерации отчета используется Allure Framework.
## Сборка
```mvn clean test```
## Генерация отчета
```mvn allure:serve```
## Ссылка на тест-сьют
https://docs.google.com/spreadsheets/d/1-OhPIOVxmvybI5DGzcIHqCfNxbpGjS80g9LMoMlTuOY/edit?usp=sharing
# API test
Используется библиотека Rest Assured.
Для тестирования выбран api https://petstore.swagger.io/#/. Документация https://petstore.swagger.io/#/.
## Сборка
```mvn clean test```
## Генерация отчета
```mvn allure:serve```
