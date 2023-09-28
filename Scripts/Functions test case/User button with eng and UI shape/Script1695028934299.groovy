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
//Mobile.startApplication('C:\\Users\\Thin Lay\\Downloads\\UAT MoMoney-1(2).apk', false)
Mobile.startApplication('C:\\Users\\Thin Lay\\Downloads\\UAT_MoMoney_070923malai.apk', false)
Mobile.delay(20)
Mobile.pressBack()

Mobile.pressBack()
Mobile.tap(findTestObject('Object Repository/login cap/app eng/android.view.ViewGroup'), 0)
Mobile.delay(6)

Mobile.tap(findTestObject('Object Repository/Mo Functions/login/android.view.View'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login cap/android.widget.EditText'), 'HeCM15nHKBI=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login cap/android.widget.EditText (1)'), 'HeCM15nHKBI=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login cap/android.widget.EditText (2)'), 'YC0926CP/9Y=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login cap/android.widget.EditText (3)'), 'YC0926CP/9Y=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login cap/android.widget.EditText (4)'), 'XtPiXH0+76g=', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/login cap/android.widget.EditText (5)'), 'XtPiXH0+76g=', 0)


Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/login cap/user button/android.view.ViewGroup'), 0)

Mobile.delay(10)



Mobile.closeApplication()
