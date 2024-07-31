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

WebUI.navigateToUrl('https://www.facebook.com/login/')

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'), 'mei@xx.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_pass'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/div_The email address you entered isnt conn_71e5d3'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Log in to Facebook/div_The email address you entered isnt conn_71e5d3'), 
    'The email address you entered isn\'t connected to an account. Find your account and log in.')

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'), 'Ameyfadila45@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_pass'), 'pb0pgP5NhrUbtUQiY4Dr9g==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_(20) Facebook/circle_Akun_xbh8q5q x1pwv2dq xvlca1e'))

WebUI.rightClick(findTestObject('Object Repository/Page_(20) Facebook/span_Mei Fadill'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_(20) Facebook/span_Mei Fadill'), 'Mei Fadill')

WebUI.click(findTestObject('Object Repository/Page_(20) Facebook/span_Keluar'))

WebUI.closeBrowser()

