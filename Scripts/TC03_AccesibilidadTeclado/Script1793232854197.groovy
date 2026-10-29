import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.baseUrl)

// Enfocamos el campo de usuario y comprobamos dónde quedó el foco
WebUI.click(findTestObject('Page_Products/txt_Username'))
WebUI.verifyEqual(
	WebUI.executeJavaScript('return document.activeElement.id', null),
	'user-name',
	FailureHandling.CONTINUE_ON_FAILURE
)

// Tab debe llevar el foco a la contraseña
WebUI.sendKeys(findTestObject('Page_Products/txt_Username'), Keys.chord(Keys.TAB))
WebUI.verifyEqual(
	WebUI.executeJavaScript('return document.activeElement.id', null),
	'password',
	FailureHandling.CONTINUE_ON_FAILURE
)

// El siguiente Tab debe llevarlo al botón Login
WebUI.sendKeys(findTestObject('Page_Products/txt_Password'), Keys.chord(Keys.TAB))
WebUI.verifyEqual(
	WebUI.executeJavaScript('return document.activeElement.id', null),
	'login-button',
	FailureHandling.CONTINUE_ON_FAILURE
)

WebUI.closeBrowser()