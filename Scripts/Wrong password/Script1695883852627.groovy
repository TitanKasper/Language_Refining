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

Mobile.startApplication('C:\\Users\\Thin Lay\\Downloads\\UAT_MoMoney_070923malai.apk', true)

Mobile.setEncryptedText(findTestObject('Object Repository/Mo Functions/Wrong password/android.widget.EditText'), 'XtPiXH0+76g=', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mo Functions/Wrong password/android.widget.EditText (1)'), 'YC0926CP/9Y=', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mo Functions/Wrong password/android.widget.EditText (2)'), 'abkeNdhXnEA=', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mo Functions/Wrong password/android.widget.EditText (3)'), 'ggNFythgxkw=', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mo Functions/Wrong password/android.widget.EditText (4)'), 'XtPiXH0+76g=', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Mo Functions/Wrong password/android.widget.EditText (5)'), 'XtPiXH0+76g=', 
    0)

Mobile.takeScreenshot('C:\\Users\\THINLA~1\\AppData\\Local\\Temp\\screenshot3340506213790935625.png')

Mobile.closeApplication()

