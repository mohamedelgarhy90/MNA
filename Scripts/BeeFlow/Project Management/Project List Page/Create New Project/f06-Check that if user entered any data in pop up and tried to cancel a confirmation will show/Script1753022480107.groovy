import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devstable.penta-b.net/penta-app-admin-entry-point/BeeFlow/')

WebUI.click(findTestObject('Object Repository/Page_Home/a_Sign In'))

WebUI.setText(findTestObject('null'), 'red')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'red')

WebUI.setEncryptedText(findTestObject('null'), '/Y8+3bfpxpw=')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_Projects Management'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create new project'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), 'e')

WebUI.click(findTestObject('Object Repository/Page_Project Management/i_Create new project_fa fa-times ModalCompo_3e935c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.doubleClick(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), '')

WebUI.click(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), 'r')

WebUI.click(findTestObject('Object Repository/Page_Project Management/i_Create new project_fa fa-times ModalCompo_3e935c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/div_Create new project'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), '')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_Project Description_description'), 'r')

WebUI.click(findTestObject('Object Repository/Page_Project Management/i_Create new project_fa fa-times ModalCompo_3e935c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_r'), '')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Choose the project supported language_47e7eb'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Project Management/input_Choose the project supported language_47e7eb'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/li_'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/i_Create new project_fa fa-times ModalCompo_3e935c'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/div_Create new project'), 0)

WebUI.click(findTestObject('Object Repository/Page_Project Management/path'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/i_Create new project_fa fa-times ModalCompo_3e935c'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create new project'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), 'w')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), '')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), 'r')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), '')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_Project Description_description'), 'r')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_r'), '')

WebUI.click(findTestObject('Object Repository/Page_Project Management/div_Project Name  .t0c126396-8b9a-4505-bfb9_584dbe'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/input_Supported Languages_localization'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/li__1'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.click(findTestObject('Object Repository/Page_Project Management/path'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Cancel'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Project Management/h4_Create new project'), 0)

WebUI.closeBrowser()

