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

WebUI.setText(findTestObject('ChartPage/Page_ProjectBackend/input_username'), username)

WebUI.setText(findTestObject('ChartPage/Page_ProjectBackend/input_password'), password)

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_add to cart'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/a_Carts            2'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/div_Shopping Cart'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/p_Total price  20150 THB'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/div_col-4 center-block'))

WebUI.setText(findTestObject('ChartPage/Page_ProjectBackend/input_amount'), '4')

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/p_Total price'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_confirm'))

WebUI.acceptAlert()

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/div_Well done You successfully'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_Logout'))

WebUI.setText(findTestObject('ChartPage/Page_ProjectBackend/input_username'), 'admin')

WebUI.setText(findTestObject('ChartPage/Page_ProjectBackend/input_password'), 'admin')

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_Login'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/a_Total Transaction'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/td_15'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/td_Garden Banana'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/td_60600 THB'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/p_Total priceTrans'))

WebUI.click(findTestObject('ChartPage/Page_ProjectBackend/button_Logout'))

WebUI.closeBrowser()

