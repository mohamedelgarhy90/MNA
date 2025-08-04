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

WebUI.callTestCase(findTestCase('Form Builder/MNA/1-Redirections/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Form Builder/MNA/1-Redirections/Navigate to plugin settings designer (Hossam)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/svg'))

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/svg'))

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/svg'))

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/svg_1'))

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/input_Mna Key_mnaKey'), 'Text_1')

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/button_Mna Key_penta-editable-textbox-button'))

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/h2_Duplicate Key Detected'), 0)

WebUI.rightClick(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/p_A field with this MNA key already exists._29583e'))

WebUI.verifyElementText(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/p_A field with this MNA key already exists._29583e'), 
    'A field with this MNA key already exists. Please use a unique key.')

WebUI.click(findTestObject('Object Repository/Checkbox/Page_Plugin Preview/button_Close'))

WebUI.closeBrowser()

