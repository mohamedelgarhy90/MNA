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

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Name_name'), '123456789012345678901234567890123456789012345678901')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Project Management/span_This input is required'))

WebUI.rightClick(findTestObject('Object Repository/Page_Project Management/span_Maximum length for this input is 50 ch_fd3af9'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Project Management/span_Maximum length for this input is 50 ch_fd3af9'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/input_Project Code_code'), '123456789012345678901234567890123456789012345678901')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Project Management/span_Maximum length for this input is 50 ch_fd3af9_1'))

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_1234567890123456789012345678901234_6cb277_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'), 
    '123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890')

WebUI.setText(findTestObject('Object Repository/Page_Project Management/textarea_1234567890123456789012345678901234_6cb277_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25_26_27_28_29'), 
    '123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678904')

WebUI.click(findTestObject('Object Repository/Page_Project Management/button_Create'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Project Management/span_Maximum length for this input is 500 c_30f9bc'))

WebUI.closeBrowser()

