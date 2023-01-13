# <img width="5%" title="Jenkins" src="images/logo/Wikipedia.svg"> Test automation project for Wikipedia mobile app

##	Content

- [Technologies and tools](#technologist-technologies-and-tools)
- [Implemented checks](#bookmark_tabs-implemented-checks)
- [Running tests from the terminal](#computer-running-tests-from-the-terminal)
- [Running tests in Jenkins](#-running-tests-in-jenkins)
- [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-Allure-report)
- [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
- [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
- [Пример запуска теста в Browserstack](#-пример-запуска-теста-в-Browserstack)


## :technologist: Technologies and tools
<p  align="center">

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/Idea.svg"></code>
<code><img width="5%" title="Java" src="images/logo/Java.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/Gradle.svg"></code>
<code><img width="5%" title="Junit5" src="images/logo/Junit5.svg"></code>
<code><img width="5%" title="AndroidStudio" src="images/logo/Android-studio.svg"></code>
<code><img width="5%" title="Appium" src="images/logo/Appium.svg"></code>
<code><img width="5%" title="Browserstack" src="images/logo/Browserstack.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/Allure.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/Allure_TO.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/Jenkins.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>

</p>

## :bookmark_tabs: Implemented checks:

- Successful article search in the application 
- Checking if the article page matches the given input 
- Adding new language

## :computer: Running tests from the terminal

### Remote running tests

```bash
gradle clean test 
-DtestType=browserstack
```

### Local running tests

```bash
gradle clean test
-DtestType=local
```

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Running tests in [Jenkins](https://jenkins.autotests.cloud/job/)

Для запуска сборки необходимо нажать кнопку <code><strong>*Собрать*</strong></code>.

<p align="center">
  <img src="images/screenshot/jenkins.png" alt="Jenkins" width="800">
</p>

После выполнения сборки, в блоке <code><strong>*История сборок*</strong></code> напротив номера сборки появится
значок *Allure Report*, кликнув по которому, откроется страница с сформированным html-отчетом.

## <img width="4%" title="Allure Report" src="images/logo/Allure.svg"> Test results report in [Allure Report](https://jenkins.autotests.cloud/job/)

<p align="center">
  <img src="images/screenshot/allure-report.png" alt="allure-report1" width="900">
</p>


## <img width="4%" title="Allure TestOPS" src="images/logo/Allure_TO.svg"> Интеграция с [Allure TestOps](https://allure.autotests.cloud/launch/18294)

### Основной дашборд

<p align="center">
  <img src="images/screenshot/dashboard.png" alt="dashboard" width="900">
</p>

### Список тестов с результатами прогона

<p align="center">
  <img src="images/screenshot/tree.png" alt="dashboard" width="900">
</p>

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота
После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов.

<p align="center">
<img title="Telegram Notifications" src="images/screenshot/telegram.png">

## <img width="4%" title="Selenoid" src="images/logo/Browserstack.svg"> Пример запуска теста в Browserstack

К каждому тесту в отчете прилагается видео.

На данном видео выполняется:

- Проверка соотвествия страницы статьи заданным параметрам поиска


<p align="center">
  <img title="Browserstack Video" src="media/video/mobile.gif">
</p>
