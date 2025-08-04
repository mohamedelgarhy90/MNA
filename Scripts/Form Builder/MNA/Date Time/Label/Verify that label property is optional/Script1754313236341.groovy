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

WebUI.callTestCase(findTestCase('Form Builder/MNA/1-Redirections/Navigate to plugin settings designer (Osama)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Date Time/Page_Plugin Preview/path'))

WebUI.setText(findTestObject('Object Repository/Date Time/Page_Plugin Preview/input_Label_label'), '')

WebUI.click(findTestObject('Object Repository/Date Time/Page_Plugin Preview/button_Submit'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Date Time/Page_Plugin Preview/button_Save'))

WebUI.click(findTestObject('Object Repository/Date Time/Page_Plugin Preview/button_Save'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Date Time/Page_Plugin Preview/div_Plugin updated successfully'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Date Time/Page_Plugin Preview/div_Plugin updated successfully'))

