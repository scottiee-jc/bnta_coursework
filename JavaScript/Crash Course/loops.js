// Loops

var club = {
    name: "liverpool",
    founded: 1892,
    isTheGOAT: true,
    owner: 'FSG',
    bestPlayer: 'Mo Salah',
    players: {
        goalkeepers: ["Alisson", "Kelleher", "Adrian"],
        defenders: ["Gomez", "Alexander-Arnold", "Van-Dijk", "Matip", "Robertson", "Ramsay", "Tsimikas", "Konate"],
        midfielders: ["Henderson", "Thiago", "Fabinho", "Carvalho", "Elliot", "Oxlade-Chamberlain", "Keita", "Milner"],
        forwards: ["Salah", "Diaz", "Nunez", "Jota", "Firmino", "Gordon"]
    }
};

for (var i = 0; i <= club.players.defenders.length; i++) {
    console.log(i);
}
