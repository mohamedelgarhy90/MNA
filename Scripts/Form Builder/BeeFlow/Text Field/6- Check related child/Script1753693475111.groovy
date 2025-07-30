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

WebUI.callTestCase(findTestCase('Form Builder/BeeFlow/a Redirection/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Form Builder/BeeFlow/a Redirection/Navigate to process'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Process Basic Information/a_Workflow'))

WebUI.click(findTestObject('Object Repository/Page_Process Workflow/span_request'))

WebUI.click(findTestObject('Object Repository/Page_Task Management/span_Form Designer'))

WebUI.click(findTestObject('Object Repository/Page_Task Management/svg'))

WebUI.click(findTestObject('Object Repository/Page_Task Management/input_Hidden_myCheck'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Task Management/select_number3(number) unique(text)'), 
    'unique', true)

WebUI.setText(findTestObject('Object Repository/Page_Task Management/input_condition_condition'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Task Management/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Task Management/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Task Management/i_Checking conflicts_fa fa-times ModalCompo_120895'))

WebUI.setText(findTestObject('Object Repository/Page_Task Management/input_Form Preview_unique'), 'test')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Task Management/input_Form Preview_text3'))

WebUI.setText(findTestObject('Object Repository/Page_Task Management/input_Form Preview_unique'), '')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Task Management/input_Form Preview_text3'), 0)

