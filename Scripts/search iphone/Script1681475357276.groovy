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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.waitForElementPresent(findTestObject('Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'), 
    10)

WebUI.setText(findTestObject('Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'), 'iphone 14 pro')

WebUI.sendKeys(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'), '100000')

WebUI.sendKeys(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmin'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'), 10)

WebUI.setText(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'), '30000000')

WebUI.sendKeys(findTestObject('Page_Jual iphone 14 pro  Tokopedia/input_Rp_pmax'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/div_Paling Sesuai'))

WebUI.click(findTestObject('Object Repository/Page_Jual iphone 14 pro  Tokopedia/p_Harga Terendah'))

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.delay(2)

WebUI.rightClick(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'))

WebUI.rightClick(findTestObject('Object Repository/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'))

WebUI.closeBrowser()

