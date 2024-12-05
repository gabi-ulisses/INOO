## Movie Streaming

Exercise that enables the offering of films and series through a platform
streaming. For this, the base class “Content” was implemented with the attributes “title” and “duration”
(in minutes), and the “exibirInfo()” method to show the title and duration of the content
registered. In addition, the derived classes “Film” were created with the attributes “director” and
“budget”, and “Series” with the attributes “seasons” and “episodiosPerSeason”. Instances of the “Film” and “Series” classes were also created, which, using the “exibirInfo()” method, presented content information.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
