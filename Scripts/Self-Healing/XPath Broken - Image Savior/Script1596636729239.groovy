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

WebUI.navigateToUrl('http://cms.demo.katalon.com/my-account/')

WebUI.setText(findTestObject('Page_My account  Katalon Shop/input__username'), 'customer')

WebUI.setEncryptedText(findTestObject('Page_My account  Katalon Shop/input__password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Page_My account  Katalon Shop/button_Log in'))

WebUI.navigateToUrl('http://cms.demo.katalon.com/my-account/')

WebUI.click(findTestObject('Page_My account  Katalon Shop/a_Shop'))

WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/img__attachment-woocommerce_thumbnail size-_5f269b'))

WebUI.click(findTestObject('Page_Happy Ninja  Katalon Shop/button_Add to cart'))

WebUI.click(findTestObject('Page_Happy Ninja  Katalon Shop/a_Checkout'))

WebUI.verifyElementText(findTestObject('Page_Checkout  Katalon Shop/h1_Checkout'), "Checkout")

WebUI.closeBrowser()
