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

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_Project Description_description'), 'a')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Supported Languages_localization'), '')

WebUI.click(findTestObject('Object Repository/Page_Project Management/input_Supported Languages_localization'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/li_'))

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), 'aa')

WebUI.click(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), 'aa')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_a'), 'aa')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create'))

WebUI.rightClick(findTestObject('Object Repository/Page_Basic Information/div_8  .t12156e40-690e-4867-bbee-d90f5aade5_1141d5'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Basic Information/a_Aa'), 0)

WebUI.closeBrowser()

