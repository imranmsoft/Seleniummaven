package com.bitm.NewtoursAutomationMaven.Uitls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.activity.InvalidActivityException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.AutomationMaven.DTO.FlighBookDTO;
import com.bitm.AutomationMaven.DTO.FlightFinderDTO;
import com.bitm.AutomationMaven.DTO.LoginDTO;

public class ExcelUtils {
	
	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;

	private static Sheet getSheet(int sheetNo) throws IOException {
		// change the file location as per your computer
		File f = new File("F:/Bitnami/Seleniummaven/src/main/java/data.xlsx");
		System.out.println("file:: " + f.exists());
		inputStream = new FileInputStream(f);
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;

	}
// Login Test Class
	public static List<LoginDTO> getLoginData() throws IOException {
		System.out.println("Util class");
		List<LoginDTO> logindata = new ArrayList<LoginDTO>();

		DataFormatter formatter = new DataFormatter();
		// login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
		System.out.println("while before enter");
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			LoginDTO login = new LoginDTO();
			byte cellCounter = 0;
			System.out.println("while after enter");
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cellCounter) {
				case 0:
					System.out.println("username : "
							+ cell.getStringCellValue());
					login.setUsername(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					login.setPassword(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}

			}
			System.out.println("loginData:: " + login.toString());
			logindata.add(login);
		}
		close();
		System.out.println("excell class");
		return logindata;
	}




//Flight Finder Excel Uitls
public static List<FlightFinderDTO> getFlightFinderData() throws IOException {
	List<FlightFinderDTO> Imrandata = new ArrayList<FlightFinderDTO>();
	DataFormatter formatter = new DataFormatter();
	// login is the first sheet in excel so getSheet parameter set to 0
	Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
	while (iterator.hasNext()) {
		Row nextRow = iterator.next();
		Iterator<Cell> cellIterator = nextRow.cellIterator();
		FlightFinderDTO FFinder = new FlightFinderDTO();
		byte cellCounter = 0;
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			switch (cellCounter) {
			case 0:
				FFinder.setPassengers(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 1:
				FFinder.setDeparting(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 2:
				FFinder.setMonth(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 3:
				FFinder.setDay(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 4:
				FFinder.setArriving(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 5:
				FFinder.setRmonth(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 6:
				FFinder.setRday(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 7:
				FFinder.setAirline(formatter.formatCellValue(cell));
				break;
			default:
				break;
			}

		}
		Imrandata.add(FFinder);
	}
	close();
	return Imrandata;
}

// FlightBook 



public static List<FlighBookDTO> getFlightBookingData() throws IOException {
	List<FlighBookDTO> FBdata = new ArrayList<FlighBookDTO>();
	DataFormatter formatter = new DataFormatter();
	System.out.println("Sheet 3");
	// Flight book  is the 3rd sheet in excel so getSheet parameter set to 0
	Iterator<Row> iterator = ExcelUtils.getSheet(2).iterator();
	while (iterator.hasNext()) {
		Row nextRow = iterator.next();
		Iterator<Cell> cellIterator = nextRow.cellIterator();
		FlighBookDTO fbooking = new FlighBookDTO();
		/*
		 * 
		 * 
		 * */
		
		
		byte cellCounter = 0;
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();
			switch (cellCounter) {
			case 0:
				fbooking.setFname(formatter.formatCellValue(cell));
				cellCounter++;
				break;
		
		   case 1:
				fbooking.setLname(formatter.formatCellValue(cell));
				cellCounter++;
			    break;

			case 2:
				fbooking.setMeal(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 3:
			fbooking.setCcard(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 4:
				fbooking.setNumber(formatter.formatCellValue(cell));
				cellCounter++;
				break;
		    case 5:
				fbooking.setEdate(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 6:
				fbooking.setEyear(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 7:
				fbooking.setFrstname(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 8:
				fbooking.setMidname(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 9:
				fbooking.setLastname(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 10:
				fbooking.setBilladd(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 11:
				fbooking.setBillCity(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 12:
				fbooking.setState(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 13:
				fbooking.setPostalcode(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 14:
				fbooking.setCountry(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 15:
				fbooking.setDeladd(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 16:
				fbooking.setDelcity(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 17:
				fbooking.setDelstate(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 18:
				fbooking.setDelpost(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			
			case 19:
				fbooking.setDelcountry(formatter.formatCellValue(cell));
				
				break;
			default:
				break;
			}

		}
		FBdata.add(fbooking);
	}
	close();
	return FBdata;
}

private static void close() throws IOException{
	workbook.close();
	inputStream.close();
	
}


}


