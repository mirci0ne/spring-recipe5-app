package guru.springframework.springrecipe5app.services;

import guru.springframework.springrecipe5app.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
