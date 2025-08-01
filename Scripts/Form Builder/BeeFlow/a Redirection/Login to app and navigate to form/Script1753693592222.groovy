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

WebUI.navigateToUrl('https://devstable.penta-b.net/bee-flow/')

WebUI.setText(findTestObject('Object Repository/Page_bee-flow/input__selectedOrg'), 'red')

WebUI.click(findTestObject('Object Repository/Page_bee-flow/input__login-button'))

WebUI.setText(findTestObject('Object Repository/Page_red/input__username'), 'tester1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_red/input__password'), 'r98I3Krbh9FyLvOoVhuYpw==')

WebUI.click(findTestObject('Object Repository/Page_red/input__login'))

WebUI.click(findTestObject('Object Repository/Page_bee-flow/input__login-button'))

WebUI.click(findTestObject('Object Repository/Page_form builder/div_New Process'))

WebUI.click(findTestObject('Object Repository/Page_form builder/span_one'))

WebUI.click(findTestObject('Object Repository/Page_form builder/span_islam process'))

