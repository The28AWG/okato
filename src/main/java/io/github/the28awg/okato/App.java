package io.github.the28awg.okato;

import io.github.the28awg.okato.address.AddressFactory;
import org.apache.commons.cli.*;

import java.io.IOException;

/**
 * Copyright (c) 2016 Ruslan Gabdrafikov <the28awg@gmail.com>
 * You may obtain a copy of the License at LICENSE.txt
 * <p>
 * Created by The28AWG on 30.09.16.
 */
public class App {

    public static void main(String[] args) {
        Options options = new Options();

        options.addOption(Option.builder().longOpt("token").hasArg().required().argName("token").desc("Токен для доступа к сервису").build());
        options.addOption(Option.builder("t").longOpt("type").hasArg().required().argName("type").desc("Тип объекта [city, street, building]").build());
        options.addOption(Option.builder("q").longOpt("query").hasArg().argName("query").desc("Строка для поиска по названию").build());
        options.addOption(Option.builder("c").longOpt("city_id").hasArg().argName("city_id").desc("Код города (населённого пункта)").build());
        options.addOption(Option.builder("s").longOpt("street_id").hasArg().argName("street_id").desc("Код улицы").build());

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("okato", options);
            System.exit(1);
            return;
        }

        AddressFactory.token(cmd.getOptionValue("token"));

        String arg_type = cmd.getOptionValue("type");
        String arg_city_id = cmd.getOptionValue("city_id", "");
        String arg_street_id = cmd.getOptionValue("street_id", "");
        String arg_query = cmd.getOptionValue("query", "");
        if (arg_type.equalsIgnoreCase("city")) {
            try {
                log(SimpleOkato.toSimpleResponse(AddressFactory.service().city(AddressFactory.token(), arg_query).execute().body()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (arg_type.equalsIgnoreCase("street")) {
            try {
                log(SimpleOkato.toSimpleResponse(AddressFactory.service().street(AddressFactory.token(), arg_city_id, arg_query).execute().body()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (arg_type.equalsIgnoreCase("building")) {
            try {
                log(SimpleOkato.toSimpleResponse(AddressFactory.service().building(AddressFactory.token(), arg_city_id, arg_street_id, arg_query).execute().body()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void log(SimpleResponse response) {
        System.out.printf("found: %s%n", response.found());
        for (SimpleOkato okato: response.result()) {
            System.out.printf("%s: %s%n", okato.id(), okato.name());
        }
    }
}
