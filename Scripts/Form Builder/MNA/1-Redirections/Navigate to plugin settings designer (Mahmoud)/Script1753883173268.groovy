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

WebUI.callTestCase(findTestCase('Form Builder/MNA/1-Redirections/Login Mahmoud'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Home/a_Applications Catalogue_common-nav__link-c_d8c219'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_My Contributions_common-nav__link-contrib_5eb766'))

WebUI.click(findTestObject('Object Repository/Page_Plugins/a_How to create a plugin_CardTitle_title__A_afb0fb'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Plugin Preview/div_Data settings'), 0)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Plugin Preview/span_Plugin Settings Designer'), 0)

WebUI.click(findTestObject('Object Repository/Page_Plugin Preview/a_Coded Lists_nav-link MobileNav_nav-dropdo_c36666'))

WebUI.click(findTestObject('Object Repository/Page_Plugin Preview/svg_Plugin Settings Designer_injected-svg'))

