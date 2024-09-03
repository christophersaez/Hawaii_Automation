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

WebUI.authenticate('http://20.55.96.239/login', 'hawaii', 'hawaiircm', 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://20.55.96.239/login')

WebUI.click(findTestObject('Object Repository/Page_Hawaii Timecard/a_Forgot PIN'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hawaii Timecard/h1_Forgot PIN'))

WebUI.setText(findTestObject('Object Repository/Page_Hawaii Timecard/input_Email_border-2 border-black p-1'), 'unknown@rcmt.com')

WebUI.click(findTestObject('Object Repository/Page_Hawaii Timecard/button_Send Email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hawaii Timecard/h2_Email address is missing'))

WebUI.closeBrowser()

