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

WebUI.navigateToUrl('https://demo.tutorialzine.com/2009/09/simple-ajax-website-jquery/demo.html#page1')

WebUI.click(findTestObject('Object Repository/Page_A simple AJAX website with jQuery/a_Page 2'))

not_run: WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Page_A simple AJAX website with jQuery/div_Aliquam imperdiet tempor facilisis Sed _4b0df1'), 
    'Aliquam imperdiet tempor facilisis. Sed elementum ultrices vulputate. In hac habitasse platea dictumst. In et accumsan turpis. Nullam laoreet posuere eros ac iaculis. Nullam ut velit arcu. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam erat volutpat.')

WebUI.closeBrowser()

