import java.util.Scanner;

public class Calculos {
    Conversion conversion;

    private String monedaInicio;
    private String monedaFin;
    private double cantidad;

    Scanner entrada = new Scanner(System.in);

    public Calculos(){

    }

    public Calculos(Conversion conversion) {
        this.conversion = conversion;
    }

    public String getMonedaInicio() {
        return monedaInicio;
    }

    public void setMonedaInicio(String monedaInicio) {
        this.monedaInicio = monedaInicio;
    }

    public String getMonedaFin() {
        return monedaFin;
    }

    public void setMonedaFin(String monedaFin) {
        this.monedaFin = monedaFin;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void almacenarValores(String monedaInicio, String monedaFin){
        this.monedaInicio = monedaInicio;
        this.monedaFin = monedaFin;

        System.out.println("Ingrese el valor que deseas convertir: ");
        this.cantidad = Double.parseDouble(entrada.nextLine());
    }

    public void almacenarValoresPersonalizados(){
        String menuOtrasOpciones = """
                Currency Code       Currency Name       Country
                AED UAE Dirham                          United Arab Emirates
                AFN Afghan Afghani                      Afghanistan
                ALL	Albanian Lek	                    Albania
                AMD Armenian Dram	                    Armenia
                ANG Netherlands Antillian Guilder       Netherlands Antilles
                AOA	Angolan Kwanza	                    Angola
                ARS	Argentine Peso	                    Argentina
                AUD	Australian Dollar	                Australia
                AWG Aruban Florin	                    Aruba
                AZN Azerbaijani Manat	                Azerbaijan
                BAM Bosnia and Herzegovina Mark	        Bosnia and Herzegovina
                BBD Barbados Dollar	                    Barbados
                BDT Bangladeshi Taka	                Bangladesh
                BGN	Bulgarian Lev	                    Bulgaria
                BHD	Bahraini Dinar	                    Bahrain
                BIF	Burundian Franc	                    Burundi
                BMD	Bermudian Dollar	                Bermuda
                BND	Brunei Dollar	                    Brunei
                BOB	Bolivian Boliviano	                Bolivia
                BRL	Brazilian Real	                    Brazil
                BSD	Bahamian Dollar	                    Bahamas
                BTN	Bhutanese Ngultrum	                Bhutan
                BWP	Botswana Pula	                    Botswana
                BYN	Belarusian Ruble	                Belarus
                BZD	Belize Dollar	                    Belize
                CAD	Canadian Dollar	                    Canada
                CDF	Congolese Franc	                    Democratic Republic of the Congo
                CHF	Swiss Franc	                        Switzerland
                CLP	Chilean Peso	                    Chile
                CNY	Chinese Renminbi	                China
                COP	Colombian Peso	                    Colombia
                CRC	Costa Rican Colon	                Costa Rica
                CUP	Cuban Peso	                        Cuba
                CVE	Cape Verdean Escudo	                Cape Verde
                CZK	Czech Koruna	                    Czech Republic
                DJF	Djiboutian Franc	                Djibouti
                DKK	Danish Krone	                    Denmark
                DOP	Dominican Peso	                    Dominican Republic
                DZD	Algerian Dinar	                    Algeria
                EGP	Egyptian Pound	                    Egypt
                ERN	Eritrean Nakfa	                    Eritrea
                ETB	Ethiopian Birr	                    Ethiopia
                EUR	Euro	                            European Union
                FJD	Fiji Dollar	                        Fiji
                FKP	Falkland Islands Pound	            Falkland Islands
                FOK	Faroese Króna	                    Faroe Islands
                GBP	Pound Sterling	                    United Kingdom
                GEL	Georgian Lari	                    Georgia
                GGP	Guernsey Pound	                    Guernsey
                GHS	Ghanaian Cedi	                    Ghana
                GIP	Gibraltar Pound	                    Gibraltar
                GMD	Gambian Dalasi	                    The Gambia
                GNF	Guinean Franc	                    Guinea
                GTQ	Guatemalan Quetzal	                Guatemala
                GYD	Guyanese Dollar	                    Guyana
                HKD	Hong Kong Dollar	                Hong Kong
                HNL	Honduran Lempira	                Honduras
                HRK	Croatian Kuna	                    Croatia
                HTG	Haitian Gourde	                    Haiti
                HUF	Hungarian Forint	                Hungary
                IDR	Indonesian Rupiah	                Indonesia
                ILS	Israeli New Shekel	                Israel
                IMP	Manx Pound	                        Isle of Man
                INR	Indian Rupee	                    India
                IQD	Iraqi Dinar	                        Iraq
                IRR	Iranian Rial	                    Iran
                ISK	Icelandic Króna	                    Iceland
                JEP	Jersey Pound	                    Jersey
                JMD	Jamaican Dollar	                    Jamaica
                JOD	Jordanian Dinar	                    Jordan
                JPY	Japanese Yen	                    Japan
                KES	Kenyan Shilling	                    Kenya
                KGS	Kyrgyzstani Som	                    Kyrgyzstan
                KHR	Cambodian Riel	                    Cambodia
                KID	Kiribati Dollar	                    Kiribati
                KMF	Comorian Franc	                    Comoros
                KRW	South Korean Won	                South Korea
                KWD	Kuwaiti Dinar	                    Kuwait
                KYD	Cayman Islands Dollar	            Cayman Islands
                KZT	Kazakhstani Tenge	                Kazakhstan
                LAK	Lao Kip	                            Laos
                LBP	Lebanese Pound	                    Lebanon
                LKR	Sri Lanka Rupee	                    Sri Lanka
                LRD	Liberian Dollar	                    Liberia
                LSL	Lesotho Loti	                    Lesotho
                LYD	Libyan Dinar	                    Libya
                MAD	Moroccan Dirham	                    Morocco
                MDL	Moldovan Leu	                    Moldova
                MGA	Malagasy Ariary	                    Madagascar
                MKD	Macedonian Denar	                North Macedonia
                MMK	Burmese Kyat	                    Myanmar
                MNT	Mongolian Tögrög	                Mongolia
                MOP	Macanese Pataca	                    Macau
                MRU	Mauritanian Ouguiya	                Mauritania
                MUR	Mauritian Rupee	                    Mauritius
                MVR	Maldivian Rufiyaa	                Maldives
                MWK	Malawian Kwacha	                    Malawi
                MXN	Mexican Peso	                    Mexico
                MYR	Malaysian Ringgit	                Malaysia
                MZN	Mozambican Metical	                Mozambique
                NAD	Namibian Dollar	                    Namibia
                NGN	Nigerian Naira	                    Nigeria
                NIO	Nicaraguan Córdoba	                Nicaragua
                NOK	Norwegian Krone	                    Norway
                NPR	Nepalese Rupee	                    Nepal
                NZD	New Zealand Dollar	                New Zealand
                OMR	Omani Rial	                        Oman
                PAB	Panamanian Balboa	                Panama
                PEN	Peruvian Sol	                    Peru
                PGK	Papua New Guinean Kina	            Papua New Guinea
                PHP	Philippine Peso	                    Philippines
                PKR	Pakistani Rupee	                    Pakistan
                PLN	Polish Złoty	                    Poland
                PYG	Paraguayan Guaraní	                Paraguay
                QAR	Qatari Riyal	                    Qatar
                RON	Romanian Leu	                    Romania
                RSD	Serbian Dinar	                    Serbia
                RUB	Russian Ruble	                    Russia
                RWF	Rwandan Franc	                    Rwanda
                SAR	Saudi Riyal	Saudi                   Arabia
                SBD	Solomon Islands Dollar	            Solomon Islands
                SCR	Seychellois Rupee	                Seychelles
                SDG	Sudanese Pound	                    Sudan
                SEK	Swedish Krona	                    Sweden
                SGD	Singapore Dollar	                Singapore
                SHP	Saint Helena Pound	                Saint Helena
                SLE	Sierra Leonean Leone	            Sierra Leone
                SOS	Somali Shilling	                    Somalia
                SRD	Surinamese Dollar	                Suriname
                SSP	South Sudanese Pound	            South Sudan
                STN	São Tomé and Príncipe Dobra	        São Tomé and Príncipe
                SYP	Syrian Pound	                    Syria
                SZL	Eswatini Lilangeni	                Eswatini
                THB	Thai Baht	                        Thailand
                TJS	Tajikistani Somoni	                Tajikistan
                TMT	Turkmenistan Manat	                Turkmenistan
                TND	Tunisian Dinar	                    Tunisia
                TOP	Tongan Paʻanga	                    Tonga
                TRY	Turkish Lira	                    Turkey
                TTD	Trinidad and Tobago Dollar	        Trinidad and Tobago
                TVD	Tuvaluan Dollar	                    Tuvalu
                TWD	New Taiwan Dollar	                Taiwan
                TZS	Tanzanian Shilling	                Tanzania
                UAH	Ukrainian Hryvnia	                Ukraine
                UGX	Ugandan Shilling	                Uganda
                USD	United States Dollar	            United States
                UYU	Uruguayan Peso	                    Uruguay
                UZS	Uzbekistani So'm	                Uzbekistan
                VES	Venezuelan Bolívar Soberano	        Venezuela
                VND	Vietnamese Đồng	                    Vietnam
                VUV	Vanuatu Vatu	                    Vanuatu
                WST	Samoan Tālā	                        Samoa
                XAF	Central African CFA Franc	        CEMAC
                XCD	East Caribbean Dollar	            Organisation of Eastern Caribbean States
                XDR	Special Drawing Rights	            International Monetary Fund
                XOF	West African CFA franc	            CFA
                XPF	CFP Franc	                        Collectivités d'Outre-Mer
                YER	Yemeni Rial                     	Yemen
                ZAR	South African Rand	                South Africa
                ZMW	Zambian Kwacha	                    Zambia
                ZWL	Zimbabwean Dollar	                Zimbabwe
                """;
        System.out.println(menuOtrasOpciones);
        System.out.print("Ingrese la moneda base con 3 letras: ");
        this.monedaInicio = entrada.next();
        System.out.print("Ingrese la moneda objetivo con 3 letras: ");
        this.monedaFin = entrada.next();

        boolean entradaValida = false;
        do {
            System.out.print("Ingrese el valor que deseas convertir: ");
            if (entrada.hasNextDouble()) {
                this.cantidad = entrada.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Error. Ingrese un valor numérico.");
                entrada.next();
            }
        } while (!entradaValida);

    }

    public String obtenerMensajeRespuesta() {
        String mensaje = getMonedaInicio().toUpperCase() + " " + getCantidad() + " equivale a: " + getMonedaFin().toUpperCase() + " " + conversion.buscaConversion(getMonedaInicio(), getMonedaFin(), getCantidad());
        System.out.println(mensaje);
        return mensaje;
    }
}