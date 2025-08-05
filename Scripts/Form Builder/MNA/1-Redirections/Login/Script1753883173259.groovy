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

WebUI.navigateToUrl('https://devstable.penta-b.net/penta-app-admin-entry-point-fb/MnA-fb/')

WebUI.click(findTestObject('Object Repository/Page_Home/a_English_mna-btn-md Header_login-btn__pFNQM'))

WebUI.setText(findTestObject('Page_Sign In/input_Organization Name_login-form__input-org-name'), 'red')

WebUI.click(findTestObject('Page_Sign In/button_Organization Name_login-form__button-login'))

WebUI.setText(findTestObject('Page_Sign in to red/input_Username  Email_login-form__input-username'), 'red')

WebUI.setEncryptedText(findTestObject('Page_Sign in to red/input_Password_login-form__input-password'), '/Y8+3bfpxpw=')

WebUI.click(findTestObject('Page_Sign in to red/input_Forgot Password_login-form__button-login'))

