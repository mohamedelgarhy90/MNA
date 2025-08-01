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

WebUI.callTestCase(findTestCase('Form Builder/MNA/1-Redirections/Navigate to plugin settings designer (Islam)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Plugin Preview/edit time'))

WebUI.click(findTestObject('Object Repository/Page_Plugin Preview/svg'))

WebUI.click(findTestObject('Object Repository/Page_Plugin Preview/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/Page_Plugin Preview/input_Mna Key_mnaKey'), '')

WebUI.click(findTestObject('Object Repository/Page_Plugin Preview/svg'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Plugin Preview/div_Mna key is required'))

WebUI.closeBrowser()

