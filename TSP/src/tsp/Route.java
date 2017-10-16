package tsp;

import java.util.ArrayList;
import java.util.List;

public class Route {
	private final City startCity; // The first city in route
	private City currentCity; // Location
	private List<City> route = new ArrayList<>(); // List of cities

	/**
	 * Constructor without variables
	 */
	public Route() {
		startCity = null;
	}

	/**
	 * Constructor with variables
	 * 
	 * @param startCity
	 */
	public Route(City startCity) {
		this.startCity = startCity;
		this.currentCity = startCity;
		this.route.add(startCity);
	}

	// Mutator functions

	public City getStartCity() {
		return startCity;
	}

	public City getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(City currentCity) {
		this.currentCity = currentCity;
	}

	public List<City> getRoute() {
		return route;
	}

	public void setRoute(List<City> route) {
		this.route = route;
	}

	@Override
	public String toString() {
		String r = "";
		if (!route.isEmpty()) {
			// Short route for easier display
			for (City c : route) {
				r += c.getName() + ",";
			}

			// Remove trailing comma
			r = r.substring(0, r.length() - 1);
		}
		return "Route{" + r + '}';
	}
}
