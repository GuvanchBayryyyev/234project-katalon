import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://54.186.33.226:2222/')

WebUI.setText(findTestObject('Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend/div_already added'))

WebUI.click(findTestObject('Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('Page_ProjectBackend/div_already added'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_ProjectBackend/a_Carts            2'))

WebUI.click(findTestObject('Page_ProjectBackend/h2_Shopping Cart'))

WebUI.click(findTestObject('Page_ProjectBackend/th_Product Name'))

WebUI.click(findTestObject('Page_ProjectBackend/th_Price'))

WebUI.click(findTestObject('Page_ProjectBackend/th_amount'))

WebUI.click(findTestObject('Page_ProjectBackend/td_Garden'))

WebUI.click(findTestObject('Page_ProjectBackend/td_20000 THB'))

WebUI.click(findTestObject('Page_ProjectBackend/div_col-4 center-block'))

WebUI.click(findTestObject('Page_ProjectBackend/td_Banana'))

WebUI.click(findTestObject('Page_ProjectBackend/td_150 THB'))

WebUI.click(findTestObject('Page_ProjectBackend/td'))

WebUI.click(findTestObject('Page_ProjectBackend/p_Total price  20150 THB'))

WebUI.closeBrowser()

