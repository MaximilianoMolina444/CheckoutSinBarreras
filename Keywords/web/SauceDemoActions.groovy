package web

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class SauceDemoActions {

	@Keyword
	def login(String username, String password) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
		WebUI.setText(findTestObject('Page_Products/txt_Username'), username)
		WebUI.setText(findTestObject('Page_Products/txt_Password'), password)
		WebUI.click(findTestObject('Page_Products/btn_Login'))
	}
}